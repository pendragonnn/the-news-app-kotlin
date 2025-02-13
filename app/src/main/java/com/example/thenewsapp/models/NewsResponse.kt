import com.example.thenewsapp.models.Article

data class NewsResponse(
    var articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)