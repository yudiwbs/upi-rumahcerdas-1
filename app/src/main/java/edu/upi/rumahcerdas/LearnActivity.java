package edu.upi.rumahcerdas;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import edu.upi.rumahcerdas.global.APIConfiguration;
import edu.upi.rumahcerdas.model.ExploreSubcategoryModel;

public class LearnActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        ExploreSubcategoryModel subCategory = (ExploreSubcategoryModel) getIntent().getSerializableExtra("subcategory");

        YouTubePlayerView contentVideo = findViewById(R.id.content_video);
        contentVideo.initialize(APIConfiguration.youtubeKey, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b) {
            youTubePlayer.cueVideo("wKJ9KzGQq0w");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
