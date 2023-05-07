package io.junnyland.reactive.ch3.rxjava_reactivestreams;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import rx.RxReactiveStreams;

@Service
public class RxFileService implements FileService {

    @Override
    public void writeTo(                                            
            String file,                                                 
            Publisher<String> content                                    
    ) {                                                             

        AsyncFileSubscriber rxSubscriber =
                new AsyncFileSubscriber(file);                            

        content.subscribe(RxReactiveStreams.toSubscriber(rxSubscriber));
    }
}
