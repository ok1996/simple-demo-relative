package cn.iosd.demo.single.collection.service;


import cn.iosd.demo.grpc.proto.person.PersonHelloGrpc;
import cn.iosd.demo.grpc.proto.person.PersonHelloReply;
import cn.iosd.demo.grpc.proto.person.PersonHelloRequest;
import cn.iosd.starter.grpc.server.annotation.GrpcService;
import io.grpc.stub.StreamObserver;

/**
 * @author ok1996
 */
@GrpcService
public class GrpcPersonService extends PersonHelloGrpc.PersonHelloImplBase {

    @Override
    public void personSayHello(PersonHelloRequest req, StreamObserver<PersonHelloReply> responseObserver) {
        PersonHelloReply reply = PersonHelloReply.newBuilder().setMessage("GrpcPersonService Hello ==> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}

