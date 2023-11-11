package com.example.jetpackcomposelesson2fallenversion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelesson2fallenversion.ui.theme.Barlow
import com.example.jetpackcomposelesson2fallenversion.ui.theme.GrayForTheButton
import com.example.jetpackcomposelesson2fallenversion.ui.theme.JetpackComposeLesson2FallenVersionTheme
import com.example.jetpackcomposelesson2fallenversion.ui.theme.textColorBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLesson2FallenVersionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp),
            painter = painterResource(id = R.drawable.background_image),
            contentDescription = "image city",
            contentScale = ContentScale.FillBounds
        )
        MainCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(550.dp)
                .align(alignment = Alignment.BottomCenter)
        )
    }
}

@Composable
fun MainCard(modifier: Modifier) {
    ElevatedCard(
        modifier = modifier,
        shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp),
        colors = CardDefaults.cardColors(
            Color.White
        )
    ) {
        Column(modifier.fillMaxSize()) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.padding(top = 20.dp, start = 20.dp),
                    text = "Sunday, 19 May 2019  |  4:30PM",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )

                Button(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(topEnd = 15.dp, bottomStart = 25.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = GrayForTheButton
                    )
                ) {
                    Text(text = "Mumbai, India", color = textColorBlue, fontFamily = Barlow, fontWeight = FontWeight.Normal)
                    Icon(
                        modifier = Modifier,
                        imageVector = Icons.Sharp.LocationOn,
                        contentDescription = "location image", tint = textColorBlue
                    )
                }
            }

            FirstRow(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
            )

            SecondRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
            ThirdRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
            FourthRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}

@Composable
fun FirstRow(modifier: Modifier) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.Center) {
        Column(
            modifier = Modifier.align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier,
                painter = painterResource(id = R.drawable.it_sunny_with_clound),
                contentDescription = "Sunny",
                tint = GrayForTheButton
            )
            Text(
                text = "Sunny",
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
        }
        Row(modifier = Modifier.padding(horizontal = 55.dp)) {
            Text(
                modifier = Modifier,
                text = "33",
                fontSize = 60.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
            Text(modifier = Modifier.padding(top = 10.dp), text = "°C", fontSize = 20.sp)
        }

        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Row {
                Text(
                    text = "35°C",
                    color = GrayForTheButton,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 5.dp, start = 1.dp),
                    painter = painterResource(id = R.drawable.arrow_up),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 12.dp)
                    .wrapContentSize()
            ) {
                Text(
                    text = "27°C",
                    color = GrayForTheButton,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 8.dp, start = 1.dp),
                    painter = painterResource(id = R.drawable.arrow_bottom),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )
            }
        }

    }
}

@Composable
fun SecondRow(modifier: Modifier) {
    Row(modifier = modifier.padding(top = 40.dp), horizontalArrangement = Arrangement.Center) {
        Column(
            modifier = Modifier.align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = R.drawable.ic_humidity),
                contentDescription = "humidity - 49%",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = "49%",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Text(
                text = "Humidity",
                color = GrayForTheButton,
                fontSize = 10.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
        }
        Column(
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = R.drawable.group),
                contentDescription = "Pressure - 1,007mBar",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = "1,007mBar",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Text(
                text = "Pressure",
                color = GrayForTheButton,
                fontSize = 10.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
        }

        Column(
            modifier = Modifier.align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = R.drawable.wind),
                contentDescription = "Wind - 23 km/h",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = "23 km/h",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Text(
                text = "Wind",
                color = GrayForTheButton,
                fontSize = 10.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
fun ThirdRow(modifier: Modifier) {
    Row(modifier = modifier.padding(top = 40.dp), horizontalArrangement = Arrangement.Center) {
        Column(
            modifier = Modifier.align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = R.drawable.sunset_ic),
                contentDescription = "humidity - 49%",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = "6:03 AM",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Text(
                text = "Sunrise",
                color = GrayForTheButton,
                fontSize = 10.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
        }

        Column(
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = R.drawable.ic_sunrise),
                contentDescription = "Pressure - 1,007mBar",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = "7:05 PM",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Text(
                text = "Sunset",
                color = GrayForTheButton,
                fontSize = 10.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal
            )
        }

        Column(
            modifier = Modifier.align(alignment = Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = R.drawable.ic_sand_clock),
                contentDescription = "Wind - 23 km/h",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = "13h 1m",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Text(
                text = "Daytime",
                color = GrayForTheButton,
                fontSize = 10.sp,
                fontFamily = Barlow,
                fontWeight = FontWeight.Normal,
            )
        }
    }
}

@Composable
fun FourthRow(modifier: Modifier) {
    Row(modifier = modifier.padding(top = 24.dp), horizontalArrangement = Arrangement.Center) {
        Card(
            modifier = Modifier.wrapContentSize(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(24.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Icon(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(25.dp)
                    .height(25.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.sunny),
                contentDescription = "Image sun",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier
                    .padding(top = 12.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                text = "Mon,21",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Row(
                modifier = Modifier
                    .padding(bottom = 16.dp, start = 18.dp, end = 18.dp, top = 4.dp)
                    .wrapContentSize()
            ) {
                Text(
                    text = "35°C",
                    color = GrayForTheButton,
                    fontSize = 10.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp, end = 5.dp),
                    painter = painterResource(id = R.drawable.arrow_up),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )
                Text(
                    text = "26°C",
                    color = GrayForTheButton,
                    fontSize = 10.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp),
                    painter = painterResource(id = R.drawable.arrow_bottom),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )

            }
        }
        Card(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .wrapContentSize(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(24.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Icon(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(25.dp)
                    .height(25.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.ic_cloudy_with_sunny),
                contentDescription = "Image sun",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier
                    .padding(top = 12.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                text = "Tue, 22",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Row(
                modifier = Modifier
                    .padding(bottom = 16.dp, start = 18.dp, end = 18.dp, top = 4.dp)
                    .wrapContentSize()
            ) {
                Text(
                    text = "35°C",
                    color = GrayForTheButton,
                    fontSize = 10.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp, end = 5.dp),
                    painter = painterResource(id = R.drawable.arrow_up),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )
                Text(
                    text = "27°C",
                    color = GrayForTheButton,
                    fontSize = 10.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp),
                    painter = painterResource(id = R.drawable.arrow_bottom),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )

            }
        }
        Card(
            modifier = Modifier.wrapContentSize(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(24.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Icon(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(25.dp)
                    .height(25.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.ic_union),
                contentDescription = "Image sun",
                tint = GrayForTheButton
            )
            Text(
                modifier = Modifier
                    .padding(top = 12.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                text = "Mon,21",
                color = Color.Black,
                fontSize = 16.sp, fontFamily = Barlow, fontWeight = FontWeight.Normal
            )
            Row(
                modifier = Modifier
                    .padding(bottom = 16.dp, start = 18.dp, end = 18.dp, top = 4.dp)
                    .wrapContentSize()
            ) {
                Text(
                    text = "35°C",
                    color = GrayForTheButton,
                    fontSize = 10.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp, end = 5.dp),
                    painter = painterResource(id = R.drawable.arrow_up),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )
                Text(
                    text = "26°C",
                    color = GrayForTheButton,
                    fontSize = 10.sp,
                    fontFamily = Barlow,
                    fontWeight = FontWeight.Normal
                )
                Icon(
                    modifier = Modifier.padding(top = 3.dp, start = 2.dp),
                    painter = painterResource(id = R.drawable.arrow_bottom),
                    contentDescription = "arrow up",
                    tint = GrayForTheButton
                )

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeLesson2FallenVersionTheme {
        Greeting(modifier = Modifier.fillMaxSize())
    }
}

