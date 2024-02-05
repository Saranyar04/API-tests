package com.solvd.carina.demo;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicInteger;

import com.solvd.carina.demo.api.post.*;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;

/**
 * This sample shows how create REST API tests.
 *
 * @author qpsdemo
 */
public class APISampleTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    /*@Test()
    @MethodOwner(owner = "qpsdemo")
    public void testCreateUser() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.setProperties("api/users/posts.properties");

        AtomicInteger counter = new AtomicInteger(0);

        postUserMethod.callAPI();
        postUserMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testCreateUserMissingSomeFields() throws Exception {
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.setProperties("api/users/posts.properties");
        postUserMethod.getProperties().remove("name");
        postUserMethod.getProperties().remove("username");
        postUserMethod.callAPIExpectSuccess();
        postUserMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testGetUsers() {
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
    public void testDeleteUsers() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod(1);
        deleteUserMethod.setProperties("api/users/posts.properties");
        deleteUserMethod.callAPIExpectSuccess();
        deleteUserMethod.validateResponse();
    }*/

    @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testGetPosts() {
        GetPostsMethod getPostsMethod = new GetPostsMethod(3);
        getPostsMethod.setProperties("api/posts/posts.properties");
        getPostsMethod.callAPI();
        getPostsMethod.validateResponse();
    }

   @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testGetAllPosts() {
        GetAllPostsMethod getAllPostsMethod = new GetAllPostsMethod();
        getAllPostsMethod.callAPIExpectSuccess();
        getAllPostsMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
    public void testDeletePosts() {
        DeletePostMethod deletePostMethod = new DeletePostMethod(4);
        //deletePostMethod.setProperties("api/users/posts.properties");
        deletePostMethod.callAPI();
        deletePostMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
    public void testCreatePost() throws Exception {
        PostPostMethod postPostMethod = new PostPostMethod();
        postPostMethod.setProperties("api/posts/posts.properties");

        AtomicInteger counter = new AtomicInteger(0);

        postPostMethod.callAPI();
        postPostMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
    public void testUpdatePost() throws Exception {
        PutPostMethod putPostMethod = new PutPostMethod(1);
        putPostMethod.setProperties("api/posts/posts.properties");

        AtomicInteger counter = new AtomicInteger(0);

        putPostMethod.callAPI();
        putPostMethod.validateResponse();
    }

}
