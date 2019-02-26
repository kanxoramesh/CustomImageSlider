package com.ramesh.awesomeimageslider

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.ramesh.awesomeslider.OnSliderClickListener
import com.ramesh.awesomeslider.SliderDataModel
import com.ramesh.awesomeslider.SliderView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSliderViews()
    }

    private fun setSliderViews() {

        var list = ArrayList<SliderDataModel>()
        list.add(SliderDataModel("https://www.gstatic.com/webp/gallery3/2.png", "Hello world"))
        list.add(SliderDataModel(R.drawable.ic_launcher_background, "Hello world hello wrold"))
        list.add(SliderDataModel("https://www.gstatic.com/webp/gallery3/4_webp_ll.png", ""))
        imageSlider.setSliderData(
            list,
            ImageView.ScaleType.CENTER_CROP,
            this
        )

    }

}
