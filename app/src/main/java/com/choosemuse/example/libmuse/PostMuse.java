package com.choosemuse.example.libmuse;

import android.os.AsyncTask;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import com.google.gson.Gson;

/**
 * Created by marcel on 05/03/17.
 */

public class PostMuse extends AsyncTask<String, Void, String> {

    protected String doInBackground(String... params) {

        try {
            OkHttpClient client = new OkHttpClient();

            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(JSON, params[1]);
            Request postMuse = new Request.Builder()
                    .url(params[0])
                    .post(body)
                    .build();

            Response response = client.newCall(postMuse).execute();
            return response.body().string();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
