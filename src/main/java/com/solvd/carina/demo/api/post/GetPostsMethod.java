package com.solvd.carina.demo.api.post;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${api_url}/posts/${post_id}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/posts/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetPostsMethod extends AbstractApiMethodV2 {

    public GetPostsMethod(int postID) {
        replaceUrlPlaceholder("api_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("post_id", String.valueOf(postID));
    }
}
