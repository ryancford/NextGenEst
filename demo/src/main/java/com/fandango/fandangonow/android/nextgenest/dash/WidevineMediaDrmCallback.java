package com.fandango.fandangonow.android.nextgenest.dash;

import android.annotation.TargetApi;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.util.Util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.UUID;

/**
 * A {@link MediaDrmCallback} for Widevine test content.
 */
@TargetApi(19)
public class WidevineMediaDrmCallback implements MediaDrmCallback
{
    private String licenserUrl;

    public WidevineMediaDrmCallback(String cencUrl)
    {
        licenserUrl = cencUrl;
    }

    public static byte[] executePost(String url, byte[] data, Map<String, String> requestProperties)
            throws IOException
    {
        HttpURLConnection urlConnection = null;
        try
        {
            urlConnection = (HttpURLConnection) new URL(url).openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Authorization", "Bearer 5a0f6da2da4848b3b14b866f7cbd9552");
            urlConnection.setRequestProperty("Content-Type", "application/octet-stream");
            urlConnection.setDoOutput(data != null);
            urlConnection.setDoInput(true);
            if (requestProperties != null)
            {
                for (Map.Entry<String, String> requestProperty : requestProperties.entrySet())
                {
                    urlConnection.setRequestProperty(requestProperty.getKey(), requestProperty.getValue());
                }
            }
            // Write the request body, if there is one.
            if (data != null)
            {
                OutputStream out = urlConnection.getOutputStream();
                try
                {
                    out.write(data);
                }
                finally
                {
                    out.close();
                }
            }
            // Read and return the response body.
            InputStream inputStream = urlConnection.getInputStream();
            try
            {
                return Util.toByteArray(inputStream);
            }
            finally
            {
                inputStream.close();
            }
        }
        finally
        {
            if (urlConnection != null)
            {
                urlConnection.disconnect();
            }
        }
    }

    @Override
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest request) throws Exception
    {
        String url = request.getDefaultUrl() + "&signedRequest=" + new String(request.getData());
        return executePost(url, null, null);
    }

    @Override
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest request) throws Exception
    {
        String url = licenserUrl;

        return executePost(url, request.getData(), null);
    }

}
