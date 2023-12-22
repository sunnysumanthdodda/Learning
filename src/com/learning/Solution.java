package com.learning;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static List<String> getResponses(List<String> validAuthTokens, List<List<String>> requests) {
        List<String> responses = new ArrayList<>();
        for (List<String> request : requests) {
            String requestType = request.get(0);
            String url = request.get(1);
            Map<String, String> params = parseUrlParameters(url);
            String authToken = params.get("token");
            String csrfToken = params.get("csrf");

            if (!validAuthTokens.contains(authToken) || (requestType.equals("POST") && (csrfToken == null || !csrfToken.matches("[a-z0-9]{8,}")))) {
                responses.add("INVALID");
            } else {
                params.remove("token");
                params.remove("csrf");
                String paramStr =    params.entrySet()
                                    .stream()
                                    .map(e -> e.getKey() + "," + e.getValue())
                                    .collect(Collectors.joining(","));
                responses.add("VALID" + ((!paramStr.isEmpty()) ? "," + paramStr : ""));
            }
        }
        return responses;
    }

    private static Map<String, String> parseUrlParameters(String url) {
        Map<String, String> params = new HashMap<>();
        if (url.contains("?")) {
            String[] urlParts = url.split("\\?");
            if (urlParts.length > 1) {
                String[] pairs = urlParts[1].split("&");
                for (String pair : pairs) {
                    String[] keyValue = pair.split("=");
                    if (keyValue.length == 2) {
                        params.put(keyValue[0], keyValue[1]);
                    }
                }
            }
        }
        return params;
    }

    public static void main(String[] args) {
        List<String> valid_auth_tokens = new ArrayList<>(Arrays.asList("et51u819p1q7","b8n5j40m76v","b8nn5j40m76v","r5b0191mlp09","r5b0191mlp09"));
        List<List<String>> requests = new ArrayList<>();
        requests.add(Arrays.asList("GET","https://example.com/?token=et51u819p1q7&id=23rt&name=alex"));
        requests.add(Arrays.asList("POST","https://example.com/?token=r5b0191mlp09&csrf=ia+09&id=u78we&name=evan"));
        System.out.print(getResponses(valid_auth_tokens,requests));
    }
}
