package my17th.com.aboutme

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addEmail(it)
        }
        findViewById<TextView>(R.id.email_text).setOnClickListener {
            updateEmail(it)
        }
    }

    @SuppressLint("ServiceCast")
    private fun addEmail(view: View) {
        val editText = findViewById<EditText>(R.id.email_edit)
        val emailTextView = findViewById<TextView>(R.id.email_text)
        emailTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        emailTextView.visibility = View.VISIBLE

        //Hide keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun updateEmail(view: View) {
        val editText = findViewById<EditText>(R.id.email_edit)
        val doneButton = findViewById<Button>(R.id.done_button)
        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE
        editText.requestFocus()
        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }
}