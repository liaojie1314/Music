package com.example.music.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.example.music.R
import com.example.music.util.TimeUtil
import com.example.music.util.dp

class TimeTextView: View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    companion object {
        const val TEXT_SIZE = 12
    }

    private var text = "00:00"
    private var align = Paint.Align.LEFT

    private val textPaint = Paint().apply {
        isAntiAlias = true
        textSize = TEXT_SIZE.dp().toFloat()
        color = ContextCompat.getColor(this@TimeTextView.context, R.color.colorTextForeground)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        textPaint.textAlign = align
        var x = 0f
        if (textPaint.textAlign == Paint.Align.RIGHT) {
            x = width.toFloat()
        }
        canvas?.drawText(text, x, TEXT_SIZE.dp().toFloat(), textPaint)
    }

    fun setText(newProcess: Int) {
        text = TimeUtil.parseDuration(newProcess)
        invalidate()
    }

    fun setAlignRight() {
        align = Paint.Align.RIGHT
    }

}