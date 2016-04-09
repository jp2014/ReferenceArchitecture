package demo.jordan.referencearchitecture

import android.content.Context
import android.content.Intent
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View

/**
 * Created by Jordan on 4/8/2016.
 */
class ScrollingActivityViewModel : IViewModel, IScrollingActivityViewModel, BaseObservable {
    private lateinit var testModel: ITestModel
    private var text: String = "Test Text"
    private lateinit var names: String;
    val hintText: String = "Test hint"

    constructor(context: Context) {
        this.context = context
        testModel = TestModel();
    }

    constructor(context: Context, testModel: ITestModel) {
        this.context = context;
        this.testModel = testModel;
    }

    override fun setText(value: String) {
        text = value;
        notifyPropertyChanged(BR.text);
    }

    @Bindable
    override fun getText(): String {
        return text;
    }

    @Bindable
    override fun getNames(): String {
        names = testModel.fakeServiceCall().joinToString();
        return names;
    }

    override fun setNames(value: String) {
        names = value
        notifyPropertyChanged(BR.names)
    }

    private val context: Context;

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