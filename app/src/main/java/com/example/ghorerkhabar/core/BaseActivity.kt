package com.example.ghorerkhabar.core

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.ghorerkhabar.R

abstract class BaseActivity: AppCompatActivity() {
     abstract fun setToolbar():Toolbar
     abstract fun setLayoutId():Int
     abstract val isHomeButtonEnabled:Boolean
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        setActionBar(setToolbar(),isHomeButtonEnabled)
    }

    private fun setActionBar(toolbar: Toolbar,isHomeButtonEnable:Boolean) {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(isHomeButtonEnabled)
        supportActionBar?.setHomeButtonEnabled(isHomeButtonEnabled)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                onBackPressed()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    fun showShortToast(text: String) {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
    fun showLongToast(text: String){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show()
    }
}