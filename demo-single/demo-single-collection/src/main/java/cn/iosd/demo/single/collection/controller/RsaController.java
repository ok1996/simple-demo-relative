package cn.iosd.demo.single.collection.controller;

import cn.iosd.demo.single.collection.vo.PersonVo;
import cn.iosd.starter.encrypt.rsa.annotation.DecryptRequestParams;
import cn.iosd.starter.encrypt.rsa.annotation.EncryptResponseParams;
import cn.iosd.starter.encrypt.rsa.annotation.SecureParams;
import cn.iosd.starter.web.domain.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ok1996
 */
@Tag(name = "Rsa测试模块")
@RestController
@RequestMapping("rsa")
public class RsaController {

    @Operation(summary = "注解测试-返回参数加密")
    @GetMapping(value = "/encryptResponse")
    @EncryptResponseParams
    public Response<String> encryptResponse(String reqString) {
        return Response.ok(reqString);
    }

    /**
     * 请求示例：G0JIO0kZgZpJ68MV91CTgadZqpUvlKTZbiC8CB4IKcjFYUjHur8PF5N5YT7APwNzr28887h5FRjJHMP+PDkAZcXhRecdouFUcaPxTBTgIvUawKsk95c6rJdS7K6VwJAGlKTMS//kkStsGcGlyjGdo/XTeQds7SCuv9Tk2umUKoFXcbWYJbXmtV5u/6iG22aEH48LhoVF0OpABSFMemFuZ5AMNeEd0YUGhg18gqmopTw7V8bHtvI22xdASg87lsThCBY6aoUC8MkxALwOsptlllOTgZkdOoXrHoHyiYFbEI7fNmXLEvaDfBYmlzDyvE18SGCrWA9bJmByPU5xxF+dpD7ITYZmNS3JNRSMSdpcMbFmzrVkfUjKCBe2IOe4dLhfNDjWAXXtLqiq3rVuGp6L/ODMBF7y5RY4yy/6GXRHd9jN82x0kkSi9a5jRNYWB7w4xsOt4vJvYDYGWnmTcSu2UZWsJFXbgbkTuTJO/h8RJ+eaMbKC33uraYX02XtHwBKRdDMSdNF5IXEHoE7XpbYYBau9SDieiJHRT/ybzRxmwedqezw6DxbSi928GCCJQmgrrewHKwhKrSsrObuyKjzgc8RMxQev5PC3OXL3WzyD4juuGmnJnW9OSNSiB08rw3tYU0yxSrLv8nWx+mF4isRmKetmVp51854G2GrjQrc/8lg=
     *
     * @param vo
     * @return
     */
    @Operation(summary = "注解测试-请求参数解密")
    @DecryptRequestParams
    @PostMapping(value = "/decryptRequestParams")
    public Response<PersonVo> decryptRequestParams(@RequestBody PersonVo vo) {
        return Response.ok(vo);
    }

    /**
     * 请求示例：G0JIO0kZgZpJ68MV91CTgadZqpUvlKTZbiC8CB4IKcjFYUjHur8PF5N5YT7APwNzr28887h5FRjJHMP+PDkAZcXhRecdouFUcaPxTBTgIvUawKsk95c6rJdS7K6VwJAGlKTMS//kkStsGcGlyjGdo/XTeQds7SCuv9Tk2umUKoFXcbWYJbXmtV5u/6iG22aEH48LhoVF0OpABSFMemFuZ5AMNeEd0YUGhg18gqmopTw7V8bHtvI22xdASg87lsThCBY6aoUC8MkxALwOsptlllOTgZkdOoXrHoHyiYFbEI7fNmXLEvaDfBYmlzDyvE18SGCrWA9bJmByPU5xxF+dpD7ITYZmNS3JNRSMSdpcMbFmzrVkfUjKCBe2IOe4dLhfNDjWAXXtLqiq3rVuGp6L/ODMBF7y5RY4yy/6GXRHd9jN82x0kkSi9a5jRNYWB7w4xsOt4vJvYDYGWnmTcSu2UZWsJFXbgbkTuTJO/h8RJ+eaMbKC33uraYX02XtHwBKRdDMSdNF5IXEHoE7XpbYYBau9SDieiJHRT/ybzRxmwedqezw6DxbSi928GCCJQmgrrewHKwhKrSsrObuyKjzgc8RMxQev5PC3OXL3WzyD4juuGmnJnW9OSNSiB08rw3tYU0yxSrLv8nWx+mF4isRmKetmVp51854G2GrjQrc/8lg=
     *
     * @param vo
     * @return
     */
    @Operation(summary = "注解测试-请求参数解密及返回参数加密")
    @SecureParams
    @PostMapping(value = "/decryptAndEncrypt")
    public Response<PersonVo> decryptAndEncrypt(@RequestBody PersonVo vo) {
        return Response.ok(vo);
    }

}
