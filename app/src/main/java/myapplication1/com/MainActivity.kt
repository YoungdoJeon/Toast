package myapplication1.com

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener{
            Toast.makeText(application, "안녕하세요", Toast.LENGTH_SHORT).show()
        }

        btnToast2.setOnClickListener {
            showCustom("안녕하신가요?")
            //hello
        }

    }

    private fun showCustom( s : String) {
        val layoutInflater =
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val layout = layoutInflater.inflate(R.layout.custom_toast, null)
        layout.txtMessage.text = s
        val toast = Toast(applicationContext)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }
}