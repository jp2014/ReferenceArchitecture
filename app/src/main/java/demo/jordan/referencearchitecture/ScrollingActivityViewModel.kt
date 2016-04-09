package demo.jordan.referencearchitecture

import android.content.Context
import android.content.Intent
import android.databinding.BaseObservable
import android.view.View

/**
 * Created by Jordan on 4/8/2016.
 */
class ScrollingActivityViewModel : ViewModel, BaseObservable {

    val text: String = "Test Text"
    val hintText: String = "Test hint"
    private val context: Context;

    constructor(context: Context) {
        this.context = context
    }

    fun fabClick(view: View) {
        val intent = Intent(context, EditTextDisplayActivity::class.java)
        intent.putExtra("tempHardCodedKey", text)
        context.startActivity(intent)
    }

    fun showSettings() {
        context.startActivity(Intent(context, SettingsActivity::class.java))
    }

    override fun destroy() {
        //unregister any listeners
    }

}