/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.20).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package nl.knaw.dans.sword3.prototype.generated.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-08T15:19:09.299+02:00[Europe/Amsterdam]")
@Api(value = "Metadata-URL", description = "the Metadata-URL API")
public interface MetadataURLApi {

    Logger log = LoggerFactory.getLogger(MetadataURLApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Retrieve the Metadata", nickname = "getMetadata", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Metadata Document", response = Object.class),
        @ApiResponse(code = 400, message = "**400 (BadRequest)** - The server could not understand your request.  Either your headers or content body are wrong or malformed."),
        @ApiResponse(code = 401, message = "**403 (Forbidden)** - You are not authorised to access this resource"),
        @ApiResponse(code = 403, message = "**401 (Unauthorized)** - You have not provided authentication information, please do so"),
        @ApiResponse(code = 404, message = "**404 (Not Found)** - There is no resource available at the URL you requested"),
        @ApiResponse(code = 405, message = "**405 (Method Not Allowed)** - The HTTP method you requested on the resource is not permitted/available in this context"),
        @ApiResponse(code = 412, message = "**412 (Precondition Failed)** - There is a problem implementing the request as-is.  This can happen for the following reasons: your checksums may not match, you may have requested mediated deposit when the server does not support that, your headers may not be consistent with each other, your If-Match headers may not mat the current ETag, or your Segmented Upload Initialisation request may not be within parameters acceptable to the server."),
        @ApiResponse(code = 301, message = "**301 (Moved Permanently)** - The URL you requested has changed, re-send this request and all future requests to the new URL"),
        @ApiResponse(code = 307, message = "**307 (Temporary Redirect)** - The URL you requested has temporarily changed, re-send this request to the new URL"),
        @ApiResponse(code = 308, message = "**308 (Permanent Redirect)** - The URL you requested has changed, re-send this request and all future requests to the new URL") })
    @RequestMapping(value = "/Metadata-URL",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Object> getMetadata(@ApiParam(value = "" ) @RequestHeader(value="Authorization", required=false) String authorization
,@ApiParam(value = "" ) @RequestHeader(value="On-Behalf-Of", required=false) String onBehalfOf
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default MetadataURLApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Replace the Metadata", nickname = "replaceMetadata", notes = "", tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Metadata Replaced, no response body"),
        @ApiResponse(code = 400, message = "**400 (BadRequest)** - The server could not understand your request.  Either your headers or content body are wrong or malformed."),
        @ApiResponse(code = 401, message = "**403 (Forbidden)** - You are not authorised to access this resource"),
        @ApiResponse(code = 403, message = "**401 (Unauthorized)** - You have not provided authentication information, please do so"),
        @ApiResponse(code = 404, message = "**404 (Not Found)** - There is no resource available at the URL you requested"),
        @ApiResponse(code = 405, message = "**405 (Method Not Allowed)** - The HTTP method you requested on the resource is not permitted/available in this context"),
        @ApiResponse(code = 412, message = "**412 (Precondition Failed)** - There is a problem implementing the request as-is.  This can happen for the following reasons: your checksums may not match, you may have requested mediated deposit when the server does not support that, your headers may not be consistent with each other, your If-Match headers may not mat the current ETag, or your Segmented Upload Initialisation request may not be within parameters acceptable to the server."),
        @ApiResponse(code = 413, message = "**413 (Payload Too Large)** - Your request body exceeds the size allowed by the server"),
        @ApiResponse(code = 415, message = "**415 (Unsupported Media Type)** - The metadata format is not the same as that identified in Metadata-Format and/or it is not supported by the server, or the packaging format is not the same as that identified in Packaging and/or it is not supported by the server"),
        @ApiResponse(code = 301, message = "**301 (Moved Permanently)** - The URL you requested has changed, re-send this request and all future requests to the new URL"),
        @ApiResponse(code = 307, message = "**307 (Temporary Redirect)** - The URL you requested has temporarily changed, re-send this request to the new URL"),
        @ApiResponse(code = 308, message = "**308 (Permanent Redirect)** - The URL you requested has changed, re-send this request and all future requests to the new URL") })
    @RequestMapping(value = "/Metadata-URL",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> replaceMetadata(@ApiParam(value = "Content to replace the Metadata.  This must be a Metadata Document."  )  @Valid @RequestBody Object body
,@ApiParam(value = "" ) @RequestHeader(value="Authorization", required=false) String authorization
,@ApiParam(value = "" ) @RequestHeader(value="Content-Disposition", required=false) String contentDisposition
,@ApiParam(value = "" ) @RequestHeader(value="Content-Length", required=false) Integer contentLength
,@ApiParam(value = "" ) @RequestHeader(value="Content-Type", required=false) String contentType
,@ApiParam(value = "" ) @RequestHeader(value="Digest", required=false) String digest
,@ApiParam(value = "" ) @RequestHeader(value="If-Match", required=false) String ifMatch
,@ApiParam(value = "" ) @RequestHeader(value="On-Behalf-Of", required=false) String onBehalfOf
,@ApiParam(value = "" ) @RequestHeader(value="Metadata-Format", required=false) String metadataFormat
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default MetadataURLApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}