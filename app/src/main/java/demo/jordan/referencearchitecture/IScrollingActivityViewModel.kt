package demo.jordan.referencearchitecture

/**
 * Created by Jordan on 4/9/2016.
 */
interface IScrollingActivityViewModel {
    fun setText(value: String)
    fun getText(): String
    fun getNames(): String
    fun setNames(value: String)
}