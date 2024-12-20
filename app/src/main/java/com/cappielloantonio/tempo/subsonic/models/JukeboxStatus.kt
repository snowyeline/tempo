package com.cappielloantonio.tempo.subsonic.models

import androidx.annotation.Keep

@Keep
open class JukeboxStatus {
    var currentIndex = 0
    var playing: Boolean = false
    var gain = 0f
    var position: Int? = null
}