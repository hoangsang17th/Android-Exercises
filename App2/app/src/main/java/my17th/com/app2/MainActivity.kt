package my17th.com.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

//        val countButton: Button = findViewById(R.id.countup_buton)
//        countButton.setOnClickListener{ countUp()}
//        val resetButton: Button = findViewById(R.id.reset_button)
//        resetButton.setOnClickListener{ reset()}
    }
    private fun rollDice() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }
    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
//    private fun rollDice() {
//        val randomInt1 = (1..6).random()
//        val randomInt2 = (1..6).random()
////        Toast.makeText(this, "button clicked",
////                Toast.LENGTH_SHORT).show()
////        val resultText: TextView = findViewById(R.id.result_text)
////        resultText.text = randomInt.toString()
//        val diceImage1 : ImageView = findViewById(R.id.dice_image1)
//        val drawableResource1 = when (randomInt1) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        val drawableResource2 = when (randomInt2) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        diceImage1.setImageResource(drawableResource1)
//        diceImage2.setImageResource(drawableResource2)
//    }
//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        if(resultText.text == "Hello World!"){
//            resultText.text = "1"
//        } else {
//            var resultInt = resultText.text.toString().toInt()
//            if (resultInt <6 ){
//                resultInt = resultInt +1
//            }
//            resultText.text = resultInt.toString()
//        }
//    }
//    private fun reset(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "0"
//    }
}