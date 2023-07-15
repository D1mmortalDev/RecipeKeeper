package com.example.recipekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var recipeName:String
    private lateinit var ingredients:String
    private lateinit var instructions:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddRecipe.setOnClickListener {
            recipeName = binding.edtRecipeName.text.toString()
            displayString(recipeName)
        }
        binding.btnAddIngredients.setOnClickListener {
            ingredients = binding.edtIngredients.text.toString()
           displayString(ingredients)
        }
        binding.btnAddInstructions.setOnClickListener {
            instructions = binding.edtInstructions.text.toString()
            displayString(instructions)
        }
        binding.btnSaveRecipe.setOnClickListener {
            //i don't know yet what to put here
        }
        binding.btnClear.setOnClickListener {
            binding.txtViewRecipeArea.setText(" ")
            binding.edtInstructions.setText("")
            binding.edtIngredients.setText("")
            binding.edtRecipeName.setText("")
        }
    }
    private fun displayString(stringValue:String){
        val currentValue  =binding.txtViewRecipeArea.text.toString()
        val newStringValue = if (currentValue.isNotEmpty()) "$currentValue\n$stringValue" else stringValue
       binding.txtViewRecipeArea.text = newStringValue
    }
}

