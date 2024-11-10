package com.kmn.pairaffair.ui

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kmn.pairaffair.ui.theme.DarkGreen
import com.kmn.pairaffair.ui.theme.DarkRed

@Composable
fun LikeDislikeButton() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = {
                Log.d("PairAffair", "Dislike button clicked")
            },
            enabled = true,
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkRed.copy(alpha = 0.2f)
            ),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.size(64.dp).border(2.dp, DarkRed, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Rounded.Clear,
                contentDescription = "Dislike",
                modifier = Modifier.size(32.dp),
                tint = DarkRed,
            )
        }
        Button(
            onClick = {
                Log.d("PairAffair", "Like button clicked")
            },
            enabled = true,
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkGreen.copy(alpha = 0.2f)
            ),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.size(64.dp).border(2.dp, DarkGreen, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Like",
                modifier = Modifier.size(32.dp),
                tint = DarkGreen
            )
        }
    }
}

@Preview
@Composable
fun LikeDislikeButtonPreview() {
    LikeDislikeButton()
}