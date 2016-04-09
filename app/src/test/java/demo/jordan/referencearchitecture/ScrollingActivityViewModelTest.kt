package demo.jordan.referencearchitecture

import android.test.mock.MockContext
import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class ScrollingActivityViewModelTest {
    internal lateinit var viewModel: IScrollingActivityViewModel
    internal var context = MockContext()
    internal val mockNames: Array<String> = arrayOf("name1", "name2", "name3")

    @Before
    fun setUp() {
        val model: ITestModel = object : ITestModel {
            override fun fakeServiceCall(): Array<String> {
                return mockNames
            }

        }
        viewModel = ScrollingActivityViewModel(context, model)
    }

    @Test
    @Throws(Exception::class)
    fun should_initText() {
        //pointless test to try out unit tests
        assertEquals(viewModel.getText(), "Test Text")
    }

    @Test
    fun should_get_correctNames() {
        assertThat(viewModel.getNames(), containsString("name1"));
    }
}