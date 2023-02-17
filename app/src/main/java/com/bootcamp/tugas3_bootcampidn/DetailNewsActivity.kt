package com.bootcamp.tugas3_bootcampidn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bootcamp.tugas3_bootcampidn.databinding.ActivityDetailNewsBinding
import com.bumptech.glide.Glide

class DetailNewsActivity : AppCompatActivity() {

	private lateinit var binding: DetailNewsActivity

	companion object{
		const val EXTRA_NEWS = "extra_news"
	}
	private lateinit var binding: ActivityDetailNewsBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = DetailNewsActivity.inflate(layoutInflater)
		setContentView(binding.root)
		val dataArticlesItem = intent.getParcelableExtra<ArticlesItem>(EXTRA_NEWS)

		binding.apply {
			tvJudul.text = dataArticle?.title
			tvDeskripsi.text = dataArticle?.content

			Glide.with(this@DetailNewsActivity)
				.load(dataArticle?.image)
				.error(R.drawable.ic_launcher_background)
				.into(imgNews)
		}
	}
}