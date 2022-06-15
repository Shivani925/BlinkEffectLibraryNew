package com.example.blinkeffectlibrary

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.Animation

object BlinkEffect {

    fun blink(view: View,color1:Int,color2:Int) {
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view, "backgroundColor",color1,color2)
        animator.duration = 600
        animator.setEvaluator(ArgbEvaluator())
        animator.repeatCount = Animation.INFINITE
        animator.repeatCount = Animation.REVERSE
        animator.start()
    }

}