package com.solvd.carina.demo.api.post;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${api_url}/posts", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/posts/_getall/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAllPostsMethod extends AbstractApiMethodV2 {

    public GetAllPostsMethod() {
        replaceUrlPlaceholder("api_url", Configuration.getRequired("api_url"));
    }
}
