package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           /** Text("Hello World!") Adicionando o elemento Text*/
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

/**Definindo uma função que pode ser composta
@Composable
fun MessageCard(name: Message) {
    Text(text = "Hello $name!")
}

*Visualizando uma função*
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("World!")
}
*/


data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(painter = painterResource(R.drawable.profile_picture),
              contentDescription = "Contact profile picture"
        )

        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }

    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
    )
}