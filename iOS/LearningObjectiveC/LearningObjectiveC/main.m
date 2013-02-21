//
//  main.m
//  LearningObjectiveC
//
//  Created by Jack Kang on 2/21/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "XYZPerson.h"
#import "XYZShoutingPerson.h"

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        
        // insert code here...
        
        XYZPerson * p = [[XYZPerson alloc] init];
        NSLog(@"XYZPerson is saying %@", [p sayHello:@"Jack"]);
        
        XYZPerson *p2 = [XYZPerson person];
        NSLog(@"XYZPerson is saying %@", [p2 sayHello:@"Jack"]);
        
        XYZPerson *sp = [[XYZShoutingPerson alloc] init];
        NSLog(@"XYZShoutingPerson is saying %@", [sp sayHello:@"Jack"]);
        
        XYZPerson *sp2 = [XYZShoutingPerson person];
        NSLog(@"XYZShoutingPerson is saying %@", [sp2 sayHello:@"Jack"]);

        XYZPerson * np;
        
        if (np) {
            NSLog(@"np is NOT null");
        } else
            NSLog(@"np is null");
        NSLog(@"Hello, World!");
        
    }
    return 0;
}

