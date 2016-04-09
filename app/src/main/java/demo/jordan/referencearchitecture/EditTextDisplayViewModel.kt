package demo.jordan.referencearchitecture

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.os.Bundle

/**
 * Created by Jordan on 4/8/2016.
 */
class EditTextDisplayViewModel : IEditTextDisplayViewModel, IViewModel, BaseObservable {

    private var editTextValue: String

    @Bindable
    fun getEditTextValue(): String {
        return editTextValue
    }

    fun setEditTextValue(value: String) {
        editTextValue = value
        notifyPropertyChanged(BR.editTextValue)
    }

    constructor(extras: Bundle) {
        editTextValue = extras.getString("tempHardCodedKey")
    }

    override fun destroy() {

    }
}