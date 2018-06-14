package com.zuezhome.hirebid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.menu
import android.view.Menu
import android.view.MenuItem
import com.zuezhome.hirebid.ui.access.LoginActivity
import android.content.Intent
import com.zuezhome.hirebid.ui.access.ProfileActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()


        return if (id == R.id.action_settings) {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            true
        } else super.onOptionsItemSelected(item)

    }
}
