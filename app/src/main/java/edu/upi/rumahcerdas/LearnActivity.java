package edu.upi.rumahcerdas;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import edu.upi.rumahcerdas.global.APIConfiguration;
import edu.upi.rumahcerdas.model.ExploreSubcategoryModel;

public class LearnActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    ExploreSubcategoryModel subCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        subCategory = (ExploreSubcategoryModel) getIntent().getSerializableExtra("subcategory");

        YouTubePlayerView contentVideo = findViewById(R.id.content_video);
        contentVideo.initialize(APIConfiguration.youtubeKey, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        //profil UPI: uK1OIx_iGcg
        //profil FIP: J-APQ-s5tA8
        //pemrograman Android:
        if (!b) {
            //youTubePlayer.cueVideo("uK1OIx_iGcg");
            youTubePlayer.cueVideo(subCategory.getIdYoutube());
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
