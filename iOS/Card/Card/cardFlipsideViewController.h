//
//  cardFlipsideViewController.h
//  Card
//
//  Created by Jack Kang on 5/23/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import <UIKit/UIKit.h>

@class cardFlipsideViewController;

@protocol cardFlipsideViewControllerDelegate
- (void)flipsideViewControllerDidFinish:(cardFlipsideViewController *)controller;
@end

@interface cardFlipsideViewController : UIViewController

@property (weak, nonatomic) id <cardFlipsideViewControllerDelegate> delegate;

- (IBAction)done:(id)sender;

@end
