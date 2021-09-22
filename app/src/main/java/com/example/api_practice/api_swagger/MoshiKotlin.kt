package com.example.api_practice.api_swagger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import io.vertx.core.impl.Args
import java.util.Date


val json = """
{
    "page": 1,
    "results": [
    {
        "adult": false,
        "backdrop_path": "/u1wHUA0R48FH4WV3sGqjwx3aNZm.jpg",
        "genre_ids": [
        16,
        18,
        10402,
        10749
        ],
        "id": 632632,
        "original_language": "ja",
        "original_title": "映画 ギヴン",
        "overview": "The film centers on the love relationship among the band's bassist Haruki Nakayama, drummer Akihiko Kaji, and Akihiko's roommate and ex-boyfriend Ugetsu Murata.",
        "popularity": 113.306,
        "poster_path": "/xKCtoYHUyX8zAg68eemnYa2orep.jpg",
        "release_date": "2020-08-22",
        "title": "Given",
        "video": false,
        "vote_average": 8.8,
        "vote_count": 208
    },
    {
        "adult": false,
        "backdrop_path": "/gNBCvtYyGPbjPCT1k3MvJuNuXR6.jpg",
        "genre_ids": [
        35,
        18,
        10749
        ],
        "id": 19404,
        "original_language": "hi",
        "original_title": "दिलवाले दुल्हनिया ले जायेंगे",
        "overview": "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
        "popularity": 24.498,
        "poster_path": "/2CAL2433ZeIihfX1Hb2139CX0pW.jpg",
        "release_date": "1995-10-20",
        "title": "Dilwale Dulhania Le Jayenge",
        "video": false,
        "vote_average": 8.8,
        "vote_count": 3140
    },
    {
        "adult": false,
        "backdrop_path": "/9Xw0I5RV2ZqNLpul6lXKoviYg55.jpg",
        "genre_ids": [
        18,
        80
        ],
        "id": 278,
        "original_language": "en",
        "original_title": "The Shawshank Redemption",
        "overview": "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
        "popularity": 65.56,
        "poster_path": "/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
        "release_date": "1994-09-23",
        "title": "The Shawshank Redemption",
        "video": false,
        "vote_average": 8.7,
        "vote_count": 19722
    },
    {
        "adult": false,
        "backdrop_path": "/rSPw7tgCH9c6NqICZef4kZjFOQ5.jpg",
        "genre_ids": [
        18,
        80
        ],
        "id": 238,
        "original_language": "en",
        "original_title": "The Godfather",
        "overview": "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
        "popularity": 53.55,
        "poster_path": "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
        "release_date": "1972-03-14",
        "title": "The Godfather",
        "video": false,
        "vote_average": 8.7,
        "vote_count": 14806
    },
    {
        "adult": false,
        "backdrop_path": "/jtAI6OJIWLWiRItNSZoWjrsUtmi.jpg",
        "genre_ids": [
        10749
        ],
        "id": 724089,
        "original_language": "en",
        "original_title": "Gabriel's Inferno Part II",
        "overview": "Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?",
        "popularity": 8.391,
        "poster_path": "/x5o8cLZfEXMoZczTYWLrUo1P7UJ.jpg",
        "release_date": "2020-07-31",
        "title": "Gabriel's Inferno Part II",
        "video": false,
        "vote_average": 8.7,
        "vote_count": 1307
    },
    {
        "adult": false,
        "backdrop_path": "/fQq1FWp1rC89xDrRMuyFJdFUdMd.jpg",
        "genre_ids": [
        10749,
        35
        ],
        "id": 761053,
        "original_language": "en",
        "original_title": "Gabriel's Inferno Part III",
        "overview": "The final part of the film adaption of the erotic romance novel Gabriel's Inferno written by an anonymous Canadian author under the pen name Sylvain Reynard.",
        "popularity": 23.235,
        "poster_path": "/fYtHxTxlhzD4QWfEbrC1rypysSD.jpg",
        "release_date": "2020-11-19",
        "title": "Gabriel's Inferno Part III",
        "video": false,
        "vote_average": 8.7,
        "vote_count": 869
    },
    {
        "adult": false,
        "backdrop_path": "/1EAxNqdkVnp48a7NUuNBHGflowM.jpg",
        "genre_ids": [
        16,
        28,
        18,
        878
        ],
        "id": 283566,
        "original_language": "ja",
        "original_title": "シン・エヴァンゲリオン劇場版:||",
        "overview": "In the aftermath of the Fourth Impact, stranded without their Evangelions, Shinji, Asuka, and Rei find refuge in one of the rare pockets of humanity that still exist on the ruined planet Earth. There, each of them live a life far different from their days as an Evangelion pilot. However, the danger to the world is far from over. A new impact is looming on the horizon—one that will prove to be the true end of Evangelion.",
        "popularity": 227.798,
        "poster_path": "/jDwZavHo99JtGsCyRzp4epeeBHx.jpg",
        "release_date": "2021-03-08",
        "title": "Evangelion: 3.0+1.0 Thrice Upon a Time",
        "video": false,
        "vote_average": 8.6,
        "vote_count": 306
    },
    {
        "adult": false,
        "backdrop_path": "/w2uGvCpMtvRqZg6waC1hvLyZoJa.jpg",
        "genre_ids": [
        10749
        ],
        "id": 696374,
        "original_language": "en",
        "original_title": "Gabriel's Inferno",
        "overview": "An intriguing and sinful exploration of seduction, forbidden love, and redemption, Gabriel's Inferno is a captivating and wildly passionate tale of one man's escape from his own personal hell as he tries to earn the impossible--forgiveness and love.",
        "popularity": 8.657,
        "poster_path": "/oyG9TL7FcRP4EZ9Vid6uKzwdndz.jpg",
        "release_date": "2020-05-29",
        "title": "Gabriel's Inferno",
        "video": false,
        "vote_average": 8.6,
        "vote_count": 2113
    },
    {
        "adult": false,
        "backdrop_path": "/loRmRzQXZeqG78TqZuyvSlEQfZb.jpg",
        "genre_ids": [
        18,
        36,
        10752
        ],
        "id": 424,
        "original_language": "en",
        "original_title": "Schindler's List",
        "overview": "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II.",
        "popularity": 29.37,
        "poster_path": "/sF1U4EUQS8YHUYjNl3pMGNIQyr0.jpg",
        "release_date": "1993-11-30",
        "title": "Schindler's List",
        "video": false,
        "vote_average": 8.6,
        "vote_count": 11816
    },
    {
        "adult": false,
        "backdrop_path": "/poec6RqOKY9iSiIUmfyfPfiLtvB.jpg",
        "genre_ids": [
        18,
        80
        ],
        "id": 240,
        "original_language": "en",
        "original_title": "The Godfather: Part II",
        "overview": "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.",
        "popularity": 38.038,
        "poster_path": "/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg",
        "release_date": "1974-12-20",
        "title": "The Godfather: Part II",
        "video": false,
        "vote_average": 8.6,
        "vote_count": 8887
    },
    {
        "adult": false,
        "backdrop_path": "/dIWwZW7dJJtqC6CgWzYkNVKIUm8.jpg",
        "genre_ids": [
        10749,
        16,
        18
        ],
        "id": 372058,
        "original_language": "ja",
        "original_title": "君の名は。",
        "overview": "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.",
        "popularity": 140.608,
        "poster_path": "/q719jXXEzOoYaps6babgKnONONX.jpg",
        "release_date": "2016-08-26",
        "title": "Your Name.",
        "video": false,
        "vote_average": 8.6,
        "vote_count": 7875
    },
    {
        "adult": false,
        "backdrop_path": "/bf9shWfUKyEB5oB7awJeKIoCehl.jpg",
        "genre_ids": [
        16,
        10751,
        14
        ],
        "id": 129,
        "original_language": "ja",
        "original_title": "千と千尋の神隠し",
        "overview": "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family.",
        "popularity": 67.229,
        "poster_path": "/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg",
        "release_date": "2001-07-20",
        "title": "Spirited Away",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 11817
    },
    {
        "adult": false,
        "backdrop_path": "/TU9NIjwzjoKPwQHoHshkFcQUCG.jpg",
        "genre_ids": [
        35,
        53,
        18
        ],
        "id": 496243,
        "original_language": "ko",
        "original_title": "기생충",
        "overview": "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
        "popularity": 103.508,
        "poster_path": "/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
        "release_date": "2019-05-30",
        "title": "Parasite",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 12141
    },
    {
        "adult": false,
        "backdrop_path": "/lQAe1hfWYDdYypRVdzTbdg6JYWP.jpg",
        "genre_ids": [
        18
        ],
        "id": 526702,
        "original_language": "en",
        "original_title": "Black Beauty",
        "overview": "Born free in the American West, Black Beauty is a horse rounded up and brought to Birtwick Stables, where she meets spirited teenager Jo Green. The two forge a bond that carries Beauty through the different chapters, challenges and adventures.",
        "popularity": 12.346,
        "poster_path": "/5ZjMNJJabwBEnGVQoR2yoMEL9um.jpg",
        "release_date": "2020-11-27",
        "title": "Black Beauty",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 217
    },
    {
        "adult": false,
        "backdrop_path": "/vxJ08SvwomfKbpboCWynC3uqUg4.jpg",
        "genre_ids": [
        14,
        18,
        80
        ],
        "id": 497,
        "original_language": "en",
        "original_title": "The Green Mile",
        "overview": "A supernatural tale set on death row in a Southern prison, where gentle giant John Coffey possesses the mysterious power to heal people's ailments. When the cell block's head guard, Paul Edgecomb, recognizes Coffey's miraculous gift, he tries desperately to help stave off the condemned man's execution.",
        "popularity": 49.374,
        "poster_path": "/velWPhVMQeQKcxggNEU8YmIo52R.jpg",
        "release_date": "1999-12-10",
        "title": "The Green Mile",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 12805
    },
    {
        "adult": false,
        "backdrop_path": "/9guoVF7zayiiUq5ulKQpt375VIy.jpg",
        "genre_ids": [
        16,
        28,
        14,
        12
        ],
        "id": 592350,
        "original_language": "ja",
        "original_title": "僕のヒーローアカデミア THE MOVIE ヒーローズ：ライジング",
        "overview": "Class 1-A visits Nabu Island where they finally get to do some real hero work. The place is so peaceful that it's more like a vacation … until they're attacked by a villain with an unfathomable Quirk! His power is eerily familiar, and it looks like Shigaraki had a hand in the plan. But with All Might retired and citizens' lives on the line, there's no time for questions. Deku and his friends are the next generation of heroes, and they're the island's only hope.",
        "popularity": 314.547,
        "poster_path": "/zGVbrulkupqpbwgiNedkJPyQum4.jpg",
        "release_date": "2019-12-20",
        "title": "My Hero Academia: Heroes Rising",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 795
    },
    {
        "adult": false,
        "backdrop_path": "/qqHQsStV6exghCM7zbObuYBiYxw.jpg",
        "genre_ids": [
        18
        ],
        "id": 389,
        "original_language": "en",
        "original_title": "12 Angry Men",
        "overview": "The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other.",
        "popularity": 23.628,
        "poster_path": "/e02s4wmTAExkKg0yF4dEG98ZRpK.jpg",
        "release_date": "1957-04-10",
        "title": "12 Angry Men",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 5845
    },
    {
        "adult": false,
        "backdrop_path": "/yHtB4KHNigx3ZoxDvQbW2SOXGfq.jpg",
        "genre_ids": [
        16,
        10751,
        12,
        14
        ],
        "id": 441130,
        "original_language": "en",
        "original_title": "Wolfwalkers",
        "overview": "In a time of superstition and magic, when wolves are seen as demonic and nature an evil to be tamed, a young apprentice hunter comes to Ireland with her father to wipe out the last pack. But when she saves a wild native girl, their friendship leads her to discover the world of the Wolfwalkers and transform her into the very thing her father is tasked to destroy.",
        "popularity": 26.606,
        "poster_path": "/ehAKuE48okTuonq6TpsNQj8vFTC.jpg",
        "release_date": "2020-10-26",
        "title": "Wolfwalkers",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 564
    },
    {
        "adult": false,
        "backdrop_path": "/l5K9elugftlcyIHHm4nylvsn26X.jpg",
        "genre_ids": [
        18
        ],
        "id": 255709,
        "original_language": "ko",
        "original_title": "소원",
        "overview": "After 8-year-old So-won narrowly survives a brutal sexual assault, her family labors to help her heal while coping with their own rage and grief.",
        "popularity": 6.973,
        "poster_path": "/x9yjkm9gIz5qI5fJMUTfBnWiB2o.jpg",
        "release_date": "2013-10-02",
        "title": "Hope",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 214
    },
    {
        "adult": false,
        "backdrop_path": "/5MgMCnslrxQfOfaq6T5ndkLlcCk.jpg",
        "genre_ids": [
        16,
        35,
        10749,
        18,
        14
        ],
        "id": 572154,
        "original_language": "ja",
        "original_title": "青春ブタ野郎はゆめみる少女の夢を見ない",
        "overview": "In Fujisawa, Sakuta Azusagawa is in his second year of high school. Blissful days with his girlfriend and upperclassman, Mai Sakurajima, are interrupted by the appearance of his first crush, Shoko Makinohara.",
        "popularity": 134.893,
        "poster_path": "/pvdBzHOWjrLl69lUswPiVnI8szv.jpg",
        "release_date": "2019-06-15",
        "title": "Rascal Does Not Dream of a Dreaming Girl",
        "video": false,
        "vote_average": 8.5,
        "vote_count": 301
    }
    ],
    "total_pages": 458,
    "total_results": 9151
}
"""
data class MoshiKotlin(
 @Json(name = "page")
 var page : String,
 @Json(name = "results")
 var results: results,
 @Json(name="total_pages")
 var total_pages : Int,
 @Json(name="total_results")
 var total_results : Int

        ) {


}

data class results(
    @Json(name="adult")
    val adult : String,
    @Json(name="backdrop_path")
    val backdrop_path : String,
    @Json(name = "genre_ids")
    val genre_ids : Array<Int>,
    @Json(name="id")
    val id : Int,
    @Json(name="original_language")
    val original_language : String,
    @Json(name = "overview")
    val overview : String,
    @Json(name = "popularity")
    val popularity : String,
    @Json(name = "poster_path")
    val poster_path : String,
    @Json(name="release_date")
    val release_date : String,
    @Json(name="title")
    val title : String,
    @Json(name="video")
    val video : String,
    @Json(name="vote_average")
    val vote_average : String,
    @Json(name="vote_count")
    val vote_count : String,

)
{

}




