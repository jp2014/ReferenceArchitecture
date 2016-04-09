package demo.jordan.referencearchitecture

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import demo.jordan.referencearchitecture.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    val viewModel: ScrollingActivityViewModel = ScrollingActivityViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityScrollingBinding = DataBindingUtil.setContentView<ActivityScrollingBinding>(this, R.layout.activity_scrolling)
        binding.viewModel = viewModel
        setSupportActionBar(findViewById(R.id.toolbar) as Toolbar?)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_settings) {
            viewModel.showSettings();
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPause() {
        super.onPause()
        viewModel.destroy();
    }
}
