//
//  firstAppModelController.h
//  aaa
//
//  Created by Jack Kang on 5/23/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import <UIKit/UIKit.h>

@class firstAppDataViewController;

@interface firstAppModelController : NSObject <UIPageViewControllerDataSource>

- (firstAppDataViewController *)viewControllerAtIndex:(NSUInteger)index storyboard:(UIStoryboard *)storyboard;
- (NSUInteger)indexOfViewController:(firstAppDataViewController *)viewController;

@end
