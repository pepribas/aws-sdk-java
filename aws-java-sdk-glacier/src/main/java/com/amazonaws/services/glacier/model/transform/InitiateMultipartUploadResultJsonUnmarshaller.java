/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InitiateMultipartUploadResult JSON Unmarshaller
 */
public class InitiateMultipartUploadResultJsonUnmarshaller implements Unmarshaller<InitiateMultipartUploadResult, JsonUnmarshallerContext> {

    public InitiateMultipartUploadResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InitiateMultipartUploadResult initiateMultipartUploadResult = new InitiateMultipartUploadResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("Location") != null) {
                context.setCurrentHeader("Location");
                initiateMultipartUploadResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
            }
            if (context.getHeader("x-amz-multipart-upload-id") != null) {
                context.setCurrentHeader("x-amz-multipart-upload-id");
                initiateMultipartUploadResult.setUploadId(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        return initiateMultipartUploadResult;
    }

    private static InitiateMultipartUploadResultJsonUnmarshaller instance;

    public static InitiateMultipartUploadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InitiateMultipartUploadResultJsonUnmarshaller();
        return instance;
    }
}
