package com.example.nellamaster.Camera.AI

import android.graphics.Bitmap

interface CardClassifier {
    fun classify(bitmap: Bitmap, rotation: Int): List<Classification>
}