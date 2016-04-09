package demo.jordan.referencearchitecture

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import demo.jordan.referencearchitecture.databinding.ActivityEdittextDisplayBinding

/**
 * Created by Jordan on 4/8/2016.
 */
class EditTextDisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityEdittextDisplayBinding = DataBindingUtil.setContentView(this, R.layout.activity_edittext_display)
        binding.viewModel = EditTextDisplayViewModel(intent.extras)
    }

}