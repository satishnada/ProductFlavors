package productflavor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simform.productflavor.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_title)
    }
}