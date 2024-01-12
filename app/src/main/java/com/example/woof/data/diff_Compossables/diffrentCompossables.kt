//package com.example.woof.data.diff_Compossables
//
//import androidx.compose.animation.AnimatedContent
//import androidx.compose.animation.ExperimentalAnimationApi
//import androidx.compose.animation.fadeIn
//import androidx.compose.animation.slideInHorizontally
//import androidx.compose.animation.with
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
//@OptIn(ExperimentalAnimationApi::class)
//@Preview
//@Composable
//fun AnimatedContentExample() {
//    var currentContent by remember { mutableStateOf(Content.First) }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Button(onClick = { currentContent = Content.First }) {
//                Text("Show First")
//            }
//            Button(onClick = { currentContent = Content.Second }) {
//                Text("Show Second")
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        AnimatedContent(
//            targetState = currentContent,
//            transitionSpec = {
//                fadeIn() with slideInHorizontally(
//                    initialOffsetX = { fullWidth -> if (fullWidth > 0) fullWidth else -fullWidth },
//                    animationSpec = tween(500)
//                )
//            },
//            label = "",
//        ) { targetContent ->
//            when (targetContent) {
//                Content.First -> {
//                    Text("This is the first content", fontWeight = FontWeight.Bold)
//                }
//
//                Content.Second -> {
//                    Text(
//                        "This is the second content",
//                        color = Color.Green,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//            }
//        }
//    }
//}
//
//enum class Content {
//    First,
//    Second
//}