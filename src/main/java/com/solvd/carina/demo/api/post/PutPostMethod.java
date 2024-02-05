package com.solvd.carina.demo.api.post;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${api_url}/users/${post_id}", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/posts/_post/rq.json")
@ResponseTemplatePath(path = "api/posts/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutPostMethod extends AbstractApiMethodV2 {

    public PutPostMethod(int postID) {
        replaceUrlPlaceholder("api_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("post_id", String.valueOf(postID));
    }
}
