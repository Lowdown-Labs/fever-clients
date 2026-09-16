package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.MediaFormats;
import com.lowdownlabs.fever.model.MediaFrame;
import com.lowdownlabs.fever.model.MediaInfo;
import com.lowdownlabs.fever.model.TranscriptSegment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class MediaApiTest {

    private final MediaApi api = new MediaApi();

    @Test
    public void getMediaBytesTest() throws ApiException {
        Integer blobId = null;
        Integer maxDim = null;
        Integer waveform = null;
        Object response =
        api.getMediaBytes(blobId, maxDim, waveform);

    }

    @Test
    public void getMediaInfoTest() throws ApiException {
        Integer blobId = null;
        String customerId = null;
        MediaInfo response =
        api.getMediaInfo(blobId, customerId);

    }

    @Test
    public void listMediaFormatsTest() throws ApiException {
        MediaFormats response =
        api.listMediaFormats();

    }

    @Test
    public void listMediaFramesTest() throws ApiException {
        Integer blobId = null;
        String customerId = null;
        List<MediaFrame> response =
        api.listMediaFrames(blobId, customerId);

    }

    @Test
    public void listMediaTranscriptTest() throws ApiException {
        Integer blobId = null;
        String customerId = null;
        List<TranscriptSegment> response =
        api.listMediaTranscript(blobId, customerId);

    }

}
