package com.example.numad21su_leorafink;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

import cz.msebera.android.httpclient.Header;

import static java.sql.DriverManager.println;

public class WebServiceActivity extends AppCompatActivity {

    private static final String TAG = "WebServiceActivity";

    private EditText mURLEditText;
    private TextView mTitleTextView;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_service);

        mURLEditText = (EditText)findViewById(R.id.URL_editText);
        mTitleTextView = (TextView)findViewById(R.id.result_textview);
        btn = findViewById(R.id.button6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProgressDialog progress = new ProgressDialog(WebServiceActivity.this);
                progress.setTitle("Loading");
                progress.setMessage("Wait while loading...");
                progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
                progress.show();

           // String url = mURLEditText.getText().toString();
                String num = mURLEditText.getText().toString();
                String url = "http://numbersapi.com/" + num + "/trivia/?json";
            new AsyncHttpClient().get(url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    String str = new String(responseBody);
                    JSONObject jObject = null;
                    try {
                        jObject = new JSONObject(str);
                    } catch (JSONException e) {
                        Log.e(TAG,"JSONException");
                        e.printStackTrace();
                    }
                    try {
                        String jText = jObject.getString("text");
                        progress.dismiss();
                        mTitleTextView.setText(jText);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    mTitleTextView.setText("Error in calling service");
                }
            });
            }
        });


    }

//    public void callWebserviceButtonHandler(View view){
//        PingWebServiceTask task = new PingWebServiceTask();
//        task.execute(mURLEditText.getText().toString()); // This is a security risk.  Don't let your user enter the URL in a real app.
//
//    }

/*


    private class PingWebServiceTask  extends AsyncTask<String, Integer, String[]> {

        @Override
        protected void onProgressUpdate(Integer... values) {
            Log.i(TAG, "Making progress...");
        }

        @Override
        protected String[] doInBackground(String... params) {


            String[] results = new String[0];
            URL url = null;
            try {

//                url = new URL("https://jsonplaceholder.typicode.com/posts/1");
                url = new URL(params[0]);

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setDoInput(true);

                conn.connect();

                // Read response.
                InputStream inputStream = conn.getInputStream();
                final String resp = convertStreamToString(inputStream);

//                JSONArray jArray = new JSONArray(resp);    // Use this if your web service returns an array of objects.  Arrays are in [ ] brackets.
                JSONObject jObject = new JSONObject(resp);
                String jText = jObject.getString("text");
                Integer jNum = jObject.getInt("number");
              //  println("TEXT: " + jText);
//                Log.d("NUM", String.valueOf(jNum));
                results[0] = jText;
                results[1] = String.valueOf(jNum);
                return results;

            } catch (MalformedURLException e) {
                Log.e(TAG,"MalformedURLException");
                e.printStackTrace();
            } catch (ProtocolException e) {
                Log.e(TAG,"ProtocolException");
                e.printStackTrace();
            } catch (IOException e) {
                Log.e(TAG,"IOException");
                e.printStackTrace();
            } catch (JSONException e) {
                Log.e(TAG,"JSONException");
                e.printStackTrace();
            }
            results[0] = "Something went wrong";
            return(results);
        }

        @Override
        protected void onPostExecute(String... s) {
            super.onPostExecute(s);
            TextView result_view = (TextView)findViewById(R.id.result_textview);
            result_view.setText(s[0]);
        }
    }


    */
/**
     * Helper function
     * @param is
     * @return
     *//*

    private String convertStreamToString(InputStream is) {
        Scanner s = new Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next().replace(",", ",\n") : "";
    }

*/

}

