package com.solvd.carina.demo;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicInteger;

import com.solvd.carina.demo.api.user.DeleteUserMethod;
import com.solvd.carina.demo.api.user.GetUserMethods;
import com.solvd.carina.demo.api.user.PostUserMethod;
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

    @Test()
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
    }


}
