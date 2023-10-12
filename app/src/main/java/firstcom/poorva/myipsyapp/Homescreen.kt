import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import firstcom.poorva.myipsyapp.BoxyCharm
import firstcom.poorva.myipsyapp.MainActivity
import firstcom.poorva.myipsyapp.R
import firstcom.poorva.myipsyapp.glambag
import firstcom.poorva.myipsyapp.iconbox
import firstcom.poorva.myipsyapp.shopactivity2

class Homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {val intentglam = Intent(this, glambag::class.java)
            startActivity(intentglam)
        }

        val myButtonb = findViewById<Button>(R.id.button4)

        myButtonb.setOnClickListener {
            val intentboxy = Intent(this, BoxyCharm::class.java)
            startActivity(intentboxy)
        }
        val mybuttoni =findViewById<Button>(R.id.button6)

        mybuttoni.setOnClickListener { val intenticon = Intent(this, iconbox::class.java)
            startActivity(intenticon)
        }
        val mybuttons=findViewById<Button>(R.id.button5)
        mybuttons.setOnClickListener {
            val intentshop = Intent(this, shopactivity2::class.java)
            startActivity(intentshop)
        }

    }
}