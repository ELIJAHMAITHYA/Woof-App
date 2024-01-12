package com.example.woof.data.valueBasedAnimations

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.woof.R

@Preview
@Composable
fun AnimateDpAsStateExample() {
    var expanded by remember { mutableStateOf(true) }

    val boxSize: Dp by animateDpAsState(targetValue = if (expanded) 250.dp else 100.dp)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { expanded = !expanded }) {
            Text(if (expanded) "Shrink" else "Expand")
        }

        Image(
            painter = painterResource(R.drawable.kotlin2),
            contentDescription = "Circle Image",
            modifier = Modifier
                .size(boxSize)
                .clip(CircleShape)
                .border(5.dp, Color.Gray, CircleShape)
        )
    }
}