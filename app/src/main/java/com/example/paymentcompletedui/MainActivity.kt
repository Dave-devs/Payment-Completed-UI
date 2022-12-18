package com.example.paymentcompletedui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paymentcompletedui.ui.theme.PaymentCompletedUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaymentCompletedUITheme {
                // A surface container using the 'background' color from the theme
                Payment()
            }
        }
    }
}

@Composable
fun Payment() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            SuccessRow()
            Spacer(modifier = Modifier.height(130.dp))
            Image(
                painter = painterResource(id = R.drawable.payment_icon),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(90.dp),
                alignment = Alignment.Center,
                colorFilter = ColorFilter.tint(Color.Blue)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Payment completed",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(35.dp))
            Text(
                text = "Lorem Ipsum is simply dummy text of " +
                        "the printing typesetting industry.",
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                fontWeight = FontWeight.Light,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(35.dp))
            Text(
                text = "Continue shopping",
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                textAlign = TextAlign.Center,
                color = Color.Blue
            )
            Spacer(modifier = Modifier.height(230.dp))
            ButtonComposable()
        }
    }
}

@Composable
fun SuccessRow() {
    Row(
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            Icons.Default.ArrowBack,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(116.dp))
        Text(
            text = "success",
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ButtonComposable(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center

    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
                .height(50.dp),
            shape = CutCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            onClick = { /*TODO*/ }) {
            Text(
                text = "Back to home",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PaymentPreview() {
   PaymentCompletedUITheme {
      Payment()
   }
}