package com.example.woof.data

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.woof.R
import com.example.woof.ui.theme.WoofTheme


@Composable
fun Kotlin() {
    Image(
        modifier = Modifier
            .size(48.dp)
            .padding(dimensionResource(R.dimen.padding_small)),
        painter = painterResource(R.drawable.kotlin2),

        contentDescription = null,
    )
}

@OptIn(ExperimentalAnimationApi::class)
@Preview
@Composable
fun ImageEnterTransitions() {
    var isVisible by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .padding(8.dp)

        ) {
        Button(modifier = Modifier.height(20.dp), onClick = {
            isVisible = !isVisible
        }) {
            Text("Show/Hide")
        }
        AnimatedVisibility(
            visible = isVisible,
            enter = fadeIn(),
            exit = fadeOut()

        ) {
            Kotlin()
        }
        AnimatedVisibility(
            visible = isVisible,
            enter = slideInVertically(),
            exit = slideOutVertically()

        ) {
            Kotlin()
        }
        AnimatedVisibility(
            visible = isVisible,
            enter = slideInHorizontally(),
            exit = slideOutHorizontally()

        ) {
            Kotlin()
        }
        AnimatedVisibility(
            visible = isVisible,
            enter = expandHorizontally(),
            exit = shrinkHorizontally()

        ) {
            Kotlin()
        }
        AnimatedVisibility(
            visible = isVisible,
            enter = scaleIn(),
            exit = scaleOut()

        ) {
            Kotlin()
        }

    }

}