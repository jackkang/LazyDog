//
//  firstAppDetailViewController.h
//  bbb
//
//  Created by Jack Kang on 5/23/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface firstAppDetailViewController : UIViewController

@property (strong, nonatomic) id detailItem;

@property (weak, nonatomic) IBOutlet UILabel *detailDescriptionLabel;
@end
