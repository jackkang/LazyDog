//
//  XYZPerson.m
//  LearningObjectiveC
//
//  Created by Jack Kang on 2/21/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import "XYZPerson.h"

@implementation XYZPerson

-(NSString *)sayHello:(NSString *)msg {
    return [NSString stringWithFormat:@("Hello, %@!"), msg];
}

+(XYZPerson *)person {
    return [[self alloc] init];
}
@end
