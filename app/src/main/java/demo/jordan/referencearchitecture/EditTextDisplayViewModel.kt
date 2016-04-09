package demo.jordan.referencearchitecture

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

/**
 * Created by Jordan on 4/8/2016.
 */
class EditTextDisplayViewModel : IEditTextDisplayViewModel, ViewModel, BaseObservable {

    private var editTextValue: String

    @Bindable
    fun getEditTextValue(): String {
        return editTextValue
    }

    fun setEditTextValue(value: String) {
        editTextValue = value
        notifyPropertyChanged(BR.editTextValue)
    }

    /**
     * Hacky way to update text until 2 way data binding is released
     */
    fun updateText(view: View) {
        setEditTextValue(((view.parent as ViewGroup).findViewById(R.id.et) as EditText).text.toString())
    }

    constructor(extras: Bundle) {
        editTextValue = extras.getString("tempHardCodedKey")
    }

    override fun destroy() {

    }
}